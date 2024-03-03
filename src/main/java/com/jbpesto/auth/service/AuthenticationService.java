package com.jbpesto.auth.service;

import com.jbpesto.auth.dao.request.SignUpRequest;
import com.jbpesto.auth.dao.request.SigninRequest;
import com.jbpesto.auth.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
