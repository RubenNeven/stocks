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
//@Entity(name = "sector")
//@AllArgsConstructor
//@NoArgsConstructor
//public class Sector {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//
//    @OneToMany(mappedBy = "sector")
//    private List<Sector> sectors;
//}
