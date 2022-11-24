
public class Album {

  IRating ratingScore;
  RatingAdapter adapter;

  public Album() {
    ratingScore = new RatingScore();
    adapter = new RatingAdapter(ratingScore);
  }

  public void setRatingScore(Float score) {
    ratingScore.setRating(score);
    adapter.saveRating();
  }

  public Float getRatingScore() {
    return this.adapter.fetchRating();
  }

  public Float getRatingStars() {
    return this.adapter.getStars();
  }
}
