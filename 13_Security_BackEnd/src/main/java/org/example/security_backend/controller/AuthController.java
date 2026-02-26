package org.example.security_backend.controller;

import lombok.RequiredArgsConstructor;
import org.example.security_backend.dto.APIResponse;
import org.example.security_backend.dto.AuthDTO;
import org.example.security_backend.dto.RegisterDTO;
import org.example.security_backend.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/auth")
@CrossOrigin
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("signup")
    public ResponseEntity<APIResponse> registerUser(@RequestBody RegisterDTO registerDTO) {
        return ResponseEntity.ok(new APIResponse
                (200,"OK",authService.register(registerDTO)));
    }
    @PostMapping("signin")
    public ResponseEntity<APIResponse> loginUser(@RequestBody AuthDTO authDTO) {
        return ResponseEntity.ok(new APIResponse(
                200,"OK",authService.authenticate(authDTO)
        ));
    }

}
