import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // should return true
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176)); // should return false
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0)); // should return true
    }
}
