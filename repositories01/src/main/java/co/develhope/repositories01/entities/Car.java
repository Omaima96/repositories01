package co.develhope.repositories01.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
    public class Car {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @NonNull
        private String modelName ;
        private String serialNumber ;

        private double currentPrice;
}
