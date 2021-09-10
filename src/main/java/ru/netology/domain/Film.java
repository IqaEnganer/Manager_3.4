package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Film {
  private int id;
  private int durationFilm;
  private String productName;
  private String Genre;
  private String imgUrl;
  private boolean premiereTomorrow;

}
