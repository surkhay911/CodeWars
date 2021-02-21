public class HalvingSum {
  int halvingSum(int n) {
    int s = n;
    while (n > 1){
    n = n / 2;
    s += n;
    }
    return s;
  }
}