/**
 * Created by shaktsin on 6/12/17.
 */
public class MedianOfTwoSortedArray {


  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    return findMedian(nums1, nums2, 0, nums1.length, 0 , nums2.length);
  }

  public static double findMedian(int[] nums1, int[] nums2, int left1, int right1, int left2, int right2) {
    int m1 =  (left1 + right1 - 1) / 2 ;
    if ((left1 + right1) % 2 == 0) m1 = m1 + 1;
    int m2 = (left2 + right2 - 1) / 2 ;
    if ((left2 + right2) % 2 == 0) m2 = m2 + 1;
    int finalMedian = (nums1.length + nums2.length) / 2;
    int totalNumber = m1 + m2 + 1;
    int l1=left1, r1=right1, l2=left2, r2=right2, m = 0, m11=m1, m22=m2;

    if (m1 < 0) {
      Double medianIndex = Math.floor((nums2.length - 1) / 2);
      return nums2[medianIndex.intValue()];
    } else if (m2 < 0) {
      Double medianIndex = Math.floor((nums1.length - 1) / 2);
      return nums1[medianIndex.intValue()];
    }

    else if (nums1[m1] > nums2[m2]) {
      if (totalNumber > finalMedian) {
        r1 = m1;
      } else {
        if (finalMedian % 2 != 0) {
          m = m1;
        }
      }
    } else if (nums1[m1] < nums2[m2]) {
      if (totalNumber > finalMedian) {
        r2 = m2;
      } else {
        if (finalMedian % 2 != 0) {
          m = m2;
        }
      }
    } else {
      return nums1[m1];
    }


    if (totalNumber > finalMedian) {
      return findMedian(nums1, nums2, l1, r1, l2 , r2);
    } else {
      if (finalMedian % 2 == 0) {
        return (nums1[m11] + nums2[m22]) / 2.0;
      } else {
        return (nums1[m1] > nums2[m2]) ? nums1[m] : nums2[m];
      }
    }
  }

  public static void main(String[] args) {
    /*System.out.println(findMedianSortedArrays(new int[]{3, 9, 14, 15, 17},
        new int[]{1, 4, 5, 10, 18, 19}));

    System.out.println(findMedianSortedArrays(new int[]{1, 3},
        new int[]{2}));

    System.out.println(findMedianSortedArrays(new int[]{1, 2},
        new int[]{3, 4}));*/

    System.out.println(findMedianSortedArrays(new int[]{},
        new int[]{1}));
  }

}
