package 开放封闭原则.错误的;

public class 错误的AreaCalculator {
    public float calculateArea(错误的Triangle t){
        return 1;
    }
    public float calculateArea(错误的Rectangle r){
        return 2;
    }
    /**
     * 如果加入新的形状 这个类需要不断的加方法 不好
     */
}
