
public class RatingStar {
  private Float stars;

  public Float getStars() {
    return stars;
  }

  public void setStars(Float stars) {
    if (stars > 5.0F) {
      this.stars = 5.0F;
    } else {
      this.stars = stars;
    }
  }
}
