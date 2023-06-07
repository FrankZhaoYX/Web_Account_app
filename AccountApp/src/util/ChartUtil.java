package util;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.objectplanet.chart.BarChart;
import com.objectplanet.chart.Chart;
public class ChartUtil {

    public static int max(double[] sampleValues) {
        int max = 0;
        for (double v : sampleValues) {
            if (v > max)
                max = (int) v;
        }
        return max;
    }

    private static String[] sampleLabels() {
        String[] sampleLabels = new String[30];

        for (int i = 0; i < sampleLabels.length; i++) {
            if (0 == i % 5)
                sampleLabels[i] = String.valueOf(i + 1 + "日");
        }
        return sampleLabels;
    }

    private static double[] sampleValues() {

        double[] result = new double[30];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 300);
        }
        return result;

    }

    public static Image getImage(int width, int height) {
        // sample data
        double[] sampleValues = sampleValues();
        //  The display text
        String[] sampleLabels = sampleLabels();
        // sample maxValue
        int max = max(sampleValues);

        // data color
        Color[] sampleColors = new Color[] { ColorUtil.blueColor };


        BarChart chart = new BarChart();

        // set num of Sample
        chart.setSampleCount(sampleValues.length);
        // set Sample data
        chart.setSampleValues(0, sampleValues);
        // set Text
        chart.setSampleLabels(sampleLabels);
        // set Text color
        chart.setSampleColors(sampleColors);
        // set the Range value
        chart.setRange(0, max * 1.2);
        // display bg line
        chart.setValueLinesOn(true);
        // display text
        chart.setSampleLabelsOn(true);
        // display text at bot
        chart.setSampleLabelStyle(Chart.BELOW);

        // the font size of text
        chart.setFont("rangeLabelFont", new Font("Arial", Font.BOLD, 12));
        // display the description
        chart.setLegendOn(true);
        // modify the size
        chart.setLegendPosition(Chart.LEFT);
        // the text inside the description
        chart.setLegendLabels(new String[] { "Monthly consumption report" });
        // the font size of description
        chart.setFont("legendFont", new Font("Dialog", Font.BOLD, 13));
        // bot text font size
        chart.setFont("sampleLabelFont", new Font("Dialog", Font.BOLD, 13));
        // chart bg color
        chart.setChartBackground(Color.white);
        // panel bg color
        chart.setBackground(ColorUtil.backgroundColor);
        // change chart to img
        Image im = chart.getImage(width, height);
        return im;
    }


}
