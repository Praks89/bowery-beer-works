package org.praks.springframework.bowerybeerworks.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/** Project Lombok used here
 * created by Praks89
 */
@Data // creates getters and setters
@NoArgsConstructor // creates no arg constructor
@AllArgsConstructor // creates all arg constructor
@Builder  // creates builder pattern
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
