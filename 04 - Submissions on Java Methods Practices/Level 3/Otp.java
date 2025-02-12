import java.util.*;

class Otp{
  public int generate(){
    Random random = new Random();
    return random.nextInt(900000) + 100000;
  }

  public static boolean checkUnique(int[] arr){
    HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : arr) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
  }

  public static void main(String[] args){
    int[] otps = new int[10];

    Otp otp = new Otp();

    for (int i = 0; i < 10; i++){
      otps[i] = otp.generate();
    }

    System.out.println(checkUnique(otps));
  }
}