package com.infopulse.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component              // application context
public class First {
    private Second second;
}
