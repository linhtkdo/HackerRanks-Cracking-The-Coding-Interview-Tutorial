class Checker implements Comparator<Player> {
  /* x.compareTo(y):
        negative value: if x < y (x should appear first)
        zero if x == y
        positive value: if x > y (x should appear second(
  */
  public int compare(Player a, Player b) {
    if (a.score == b.score) return a.name.compareTo(b.name);
    return b.score - a.score; // bigger score comes first
  }
}
      
  
  
