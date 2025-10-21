package com.event_driven_kafka.demo.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    private Long orderId;

    @Override
    public String toString() {
        return super.toString();
    }
}
