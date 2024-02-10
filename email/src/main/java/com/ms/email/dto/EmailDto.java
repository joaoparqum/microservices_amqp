package com.ms.email.dto;

import java.util.UUID;

public record EmailDto(UUID userId, String emailTo, String subject, String text) {
}
