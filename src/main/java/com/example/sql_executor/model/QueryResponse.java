package com.example.sql_executor.model;

import java.util.List;
import java.util.Map;

public class QueryResponse {
    private String status;
    private List<Map<String, Object>> result;

    public QueryResponse(String status, List<Map<String, Object>> result) {
        this.status = status;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public List<Map<String, Object>> getResult() {
        return result;
    }
}