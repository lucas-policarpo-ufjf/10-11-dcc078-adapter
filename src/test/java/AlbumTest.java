import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumTest {
  @Test
  void shouldLimitRatingScoreTo10() {
    Album album = new Album();
    album.setRatingScore(11.0F);

    assertEquals(10.0F, album.getRatingScore());
  }

  @Test
  void shouldLimitRatingStarTo5() {
    Album album = new Album();
    album.setRatingScore(11.0F);

    assertEquals(5.0F, album.getRatingStars());
  }

  @Test
  void shouldReturnRatingScoreCorrectly() {
    Album album = new Album();
    album.setRatingScore(5.5F);

    assertEquals(5.5F, album.getRatingScore());
  }

  @Test
  void shouldReturnRatingStarCorrectly() {
    Album album = new Album();
    album.setRatingScore(5.5F);

    assertEquals(2.75F, album.getRatingStars());
  }

}
