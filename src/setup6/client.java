package setup6;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/18 14:39
 */
public class client {

    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChat("histogram");
        chart.display();
    }
}

interface Chart {
    void display();
}

class HistogramChart implements Chart {

    @Override
    public void display() {
        System.out.println("��ʾ��״ͼ��");
    }

    HistogramChart() {
        System.out.println("������״ͼ��");
    }
}

class LineChat implements Chart {

    @Override
    public void display() {
        System.out.println("��ʾ����ͼ��");
    }

    LineChat() {
        System.out.println("��������ͼ��");
    }
}

class PieChat implements Chart {

    @Override
    public void display() {
        System.out.println("������״ͼ��");
    }

    PieChat() {
        System.out.println("��ʾ��״ͼ��");
    }
}

class ChartFactory {

    public static Chart getChat(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("��ʼ��������״ͼ��");
        } else if (type.equalsIgnoreCase("pir")) {
            chart = new PieChat();
            System.out.println("��ʼ�����ñ�״ͼ��");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChat();
            System.out.println("��ʼ����������ͼ��");
        }
        return chart;
    }
}