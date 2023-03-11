package com.ailiving.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;


@Data
@AllArgsConstructor
public class Response implements Serializable {
    String result;
}
