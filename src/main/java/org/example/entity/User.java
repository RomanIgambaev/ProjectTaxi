package org.example.entity.users;

import lombok.*;
import org.example.entity.enums.UserRole;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder

public class User implements Serializable {
    protected UUID userId;
    protected String username;
    protected String password;
    protected String name;
    protected UserRole role;
}
