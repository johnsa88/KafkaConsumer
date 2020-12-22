package com.kafka.consumer.listener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.consumer.domain.Employee;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "employee_id_sample_topic", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


//    @KafkaListener(topics = "employee_sample_topic", groupId = "group_json",
//            containerFactory = "employeeKafkaListenerFactory")
//    public void consumeJson(Employee employee) {
//        System.out.println("Consumed JSON Message: " + employee);
//    }
}