package com.example.sql_executor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.sql_executor.dto.QueryResponse;

import java.util.List;
import java.util.Map;

@Service
public class QueryService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public QueryResponse executeQuery(String sql) {
        try {
            List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
            return new QueryResponse("success", result);
        } catch (Exception e) {
            return new QueryResponse("error: " + e.getMessage(), null);
        }
    }

    public List<String> getAllTables() {
        String sql = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'public'";
        return jdbcTemplate.queryForList(sql, String.class);
    }
}
