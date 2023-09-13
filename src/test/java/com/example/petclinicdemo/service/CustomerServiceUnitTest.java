package com.example.petclinicdemo.service;

import com.example.petclinicdemo.model.Customer;
import com.example.petclinicdemo.repository.CustomerRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class CustomerServiceUnitTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    private Customer customer;

    @BeforeEach
    public void setup(){
        customer = Customer.builder()
                .name("John")
                .address("Nejlikevägen 10")
                .city("Lindome")
                .phone_number("0708667373")
                .pet("Fish")
                .build();
    }

    @Test
    public void Should_ReturnCustomer_WhenSaveCustomer(){
        //Arrange
        given(customerRepository.save(customer)).willReturn(customer);
        //Act
        Customer savedCustomer = customerService.save(customer);
        //Assert
        Assertions.assertThat(savedCustomer).isNull();
        verify(customerRepository, times(1)).save(customer);
        verifyNoMoreInteractions(customerRepository);
    }

}