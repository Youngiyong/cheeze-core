package com.cheese.admin.model.transport;

import com.cheese.admin.model.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdapterServerResponse {
    private Status status;
    private String errorMessage;
    private String sessionId;
}
