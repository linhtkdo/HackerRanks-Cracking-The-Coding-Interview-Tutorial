public class Solution {
  public static int indexOf(int[] menu, int val, int excludeThis) {
    for (int i=0; i < menu.length; i++)
      if (menu[i] == val && i != excludeThis) 
        return i;
    return -1;
  }
  
  public static int[] getIndicesFromValues(int[] menu, int val1, int val2) {
    int index1 = indexOf(menu, val1, -1);
    int index2 = indexOf(menu, val2, index1);
    int[] indices = {Math.min(index1, index2), Math.max(index1, index2)};
    return indices;
  }
  
  /* find the indices of 2 items on the menu that allow us to spend all our money */
  public static int[] findChoices(int[] menu, int money) {
    int[] sortedMenu = menu.clone();
    Arrays.sort(sortedMenu);
    
    for (int i=0; i<sortedMenu.length; i++) {
      int complement = money - menu[i];
      int loc = Arrays.binarySearch(sortedMenu, i+1, sortedMenu.length, complement);
      if (loc >= 0 && loc < menu.length && menu[loc] == complement) {
        int[] indices = getIndicesFromValues(menu, menu[i], complement);
        return indices;
      }
    }
    return null;
  }
}
    
    
