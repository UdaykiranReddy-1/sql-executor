package com.example.sql_executor.controller;

import com.example.sql_executor.service.QueryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sql")
public class QueryController {

    @Autowired
    private QueryService queryService;

    @PostMapping("/execute")
    public ResponseEntity<?> executeQuery(@RequestBody String sqlQuery) {
        Object result = queryService.executeQuery(sqlQuery);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/tables")
    public ResponseEntity<List<String>> getAllTables() {
        List<String> tables = queryService.getAllTables();
        return ResponseEntity.ok(tables);
    }
}
