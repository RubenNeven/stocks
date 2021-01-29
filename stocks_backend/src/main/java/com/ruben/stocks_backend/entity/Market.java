//package com.ruben.stocks_backend.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Data
//@Entity(name = "market")
//@AllArgsConstructor
//@NoArgsConstructor
//public class Market {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String marketName;
//
//    @OneToMany(mappedBy = "market")
//    private List<Market> markets;
//}
