import java.util.*;

public class L2022212032_17_Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试示例 1
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> result1 = solution.findRepeatedDnaSequences(s1);
        System.out.println("Test Case 1:");
        System.out.println("Input: " + s1);
        System.out.println("Output: " + result1);
        System.out.println("Expected: [AAAAACCCCC, CCCCCAAAAA]");
        System.out.println();

        // 测试示例 2
        String s2 = "AAAAAAAAAAAAA";
        List<String> result2 = solution.findRepeatedDnaSequences(s2);
        System.out.println("Test Case 2:");
        System.out.println("Input: " + s2);
        System.out.println("Output: " + result2);
        System.out.println("Expected: [AAAAAAAAAA]");
        System.out.println();

        // 自定义测试示例
        String s3 = "ACGTACGTACGTACGT";
        List<String> result3 = solution.findRepeatedDnaSequences(s3);
        System.out.println("Test Case 3:");
        System.out.println("Input: " + s3);
        System.out.println("Output: " + result3);
        System.out.println("Expected: [ACGTACGTAC]");
        System.out.println();
    }
}
