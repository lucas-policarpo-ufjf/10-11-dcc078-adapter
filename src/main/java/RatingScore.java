
public class RatingScore implements IRating {

  private Float score;

  public Float getRating() {
    return this.score;
  }

  public void setRating(Float score) {
    if (score > 10.0F) {
      this.score = 10.0F;
    } else {
      this.score = score;
    }
  }
}
