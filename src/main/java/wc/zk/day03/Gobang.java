package wc.zk.day03;

import java.util.Scanner;

/**
 * 该类的功能描述
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 14:16:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class Gobang {
    /*
        1.创建15*15的二维数组，初始化   char[][]
        2.在控制台输出棋盘
        3.用户下棋  黑白棋交替
        4.判断坐标是否越界
        5.每下一步棋，判断输赢
     */
    /*
        判断输赢：五个相同的棋子相连
        11  12  13  14  15
        21  22
        31      33
        41          44
        51             55
    */
    //创建棋盘二维数组
    static char[][] checkerboard = new char[15][15];
    //定义一个标记flag。true-黑棋，false-白棋
    static boolean flag = true;
    //定义黑棋样式
    static char black = '★';
    //定义白棋样式
    static char white = '☆';
    static Scanner scanner = new Scanner(System.in);

    //初始化棋盘
    public static void init() {
        //创建数组num，为棋盘进行边界行列赋值
        char[] num = {'⒈', '⒉', '⒊', '⒋', '⒌', '⒍', '⒎', '⒏', '⒐', '⒑', '⒒', '⒓', '⒔', '⒕', '⒖'};
        //初始化数组
        for (int i = 0; i < checkerboard.length; i++) {
            for (int j = 0; j < checkerboard[i].length; j++) {
                checkerboard[i][j] = '十';
                //把棋盘最后一列的'十'替换为num数组中的元素
                if (j == checkerboard[i].length - 1) {
                    checkerboard[i][j] = num[i];
                }
                //把棋盘最后一行的'十'替换为num数组中的元素
                if (i == checkerboard[j].length - 1) {
                    checkerboard[i][j] = num[j];
                }
            }
        }
    }

    //判断坐标是否越界
    public static boolean checkPointCross(int x, int y) {
        if (x < 0 || x > 13 || y < 0 || y > 13) {
            return false;
        }
        return true;
    }

    //判断坐标处是否已有棋子
    public static boolean checkPointExit(int x, int y) {
        if (checkerboard[x - 1][y - 1] != '十') {
            return false;
        }
        return true;
    }

    //判断输赢
    public static boolean judgeWinLose() {
        if (flag) {
            //判断黑棋的输赢
            for (int i = 0; i < checkerboard.length; i++) {
                for (int j = 0; j < checkerboard[i].length; j++) {
                    //遍历每个棋子，横向向右找五个
                    if (checkerboard[i][j] == black && checkerboard[i][j + 1] == black && checkerboard[i][j + 2] == black && checkerboard[i][j + 3] == black && checkerboard[i][j + 4] == black) {
                        return true;
                    }
                    //遍历每个棋子，竖直向下找五个
                    if (checkerboard[i][j] == black && checkerboard[i + 1][j] == black && checkerboard[i + 2][j] == black && checkerboard[i + 3][j] == black && checkerboard[i + 4][j] == black) {
                        return true;
                    }
                    //遍历每个棋子，斜向右下找五个
                    if (checkerboard[i][j] == black && checkerboard[i + 1][j + 1] == black && checkerboard[i + 2][j + 2] == black && checkerboard[i + 3][j + 3] == black && checkerboard[i + 4][j + 4] == black) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            //判断白棋的输赢
            for (int i = 0; i < checkerboard.length; i++) {
                for (int j = 0; j < checkerboard[i].length; j++) {
                    //遍历每个棋子，横向向右找五个
                    if (checkerboard[i][j] == white && checkerboard[i][j + 1] == white && checkerboard[i][j + 2] == white && checkerboard[i][j + 3] == white && checkerboard[i][j + 4] == white) {
                        return true;
                    }
                    //遍历每个棋子，竖直向下找五个
                    if (checkerboard[i][j] == white && checkerboard[i + 1][j] == white && checkerboard[i + 2][j] == white && checkerboard[i + 3][j] == white && checkerboard[i + 4][j] == white) {
                        return true;
                    }
                    //遍历每个棋子，斜向右下找五个
                    if (checkerboard[i][j] == white && checkerboard[i + 1][j + 1] == white && checkerboard[i + 2][j + 2] == white && checkerboard[i + 3][j + 3] == white && checkerboard[i + 4][j + 4] == white) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    //开始下棋
    public static void playChess() {
        while (true) {
            if (flag) {
                System.out.println("黑棋下子！");
                System.out.print("请输入横坐标：");
                int x = scanner.nextInt();
                System.out.print("请输入纵坐标：");
                int y = scanner.nextInt();
                if (Gobang.checkPointCross(x, y) && Gobang.checkPointExit(x, y)) {
                    checkerboard[x - 1][y - 1] = black;
                    //下棋之后打印棋盘
                    Gobang.print();
                    //判断输赢
                    if (judgeWinLose()) {
                        System.out.println("黑棋胜！");
                        break;
                    }
                } else {
                    System.out.println("坐标越界或坐标处已有棋子！");
                    continue;
                }
                flag = false;
            } else {
                System.out.println("白棋下子！");
                System.out.print("请输入横坐标：");
                int x = scanner.nextInt();
                System.out.print("请输入纵坐标：");
                int y = scanner.nextInt();
                if (Gobang.checkPointCross(x, y) && Gobang.checkPointExit(x, y)) {
                    checkerboard[x - 1][y - 1] = white;
                    //下棋之后打印棋盘
                    Gobang.print();
                    //判断输赢
                    if (judgeWinLose()) {
                        System.out.println("白棋胜！");
                        break;
                    }
                } else {
                    System.out.println("坐标越界或坐标处已有棋子！");
                    continue;
                }
                flag = true;
            }
        }
    }

    //打印输出棋盘
    public static void print() {
        //输出棋盘
        for (int i = 0; i < checkerboard.length; i++) {
            for (int j = 0; j < checkerboard[i].length; j++) {
                System.out.print(checkerboard[i][j]);
            }
            System.out.println();
        }
    }
}