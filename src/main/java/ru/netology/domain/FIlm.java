package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FIlm {
  private int id;
  private int durationFilm;
  private String productName;
  private String Genre;
  private String imgUrl;
  private boolean premiereTomorrow;

}
