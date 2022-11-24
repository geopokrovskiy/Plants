package com.geopokrovskiy.model;

import java.util.Objects;

/**
 *  Создайте класс Plant в пакете model, описывающий понятие растение, определите для него конструкторы по умолчанию,
 *  с параметрами для инициализации только двух любых полей и для инициализации всех полей (всего 3 конструктора).
 *  У класса Plant поля: название, цвет, количество стеблей, время жизни, рыночная цена.
 */
public class Plant {
    private String name;
    private String color;
    private int stemCount;
    private int lifeTime;
    private double price;

    private Size size;

    /**
     * Nested class Size, описывающий размеры растения.
     * Сделать в качестве поля Plant объект класса Size.
     * Поля класса Size: длина, высота, периметр растения.
     * Конструкторы по умолчанию и с аргументами (длина и высота),
     * периметр сделать автоматически вычисляемым полем, для его вычисления на основе полей
     * длины и высоты написать отдельный метод setPerimetr.
     */
    public static class Size {
        private double length;
        private double height;
        private double perimeter;

        /**
         * default constructor
         */
        public Size() {
        }

        /**
         * parameter constructor
         * @param length
         * @param height
         */
        public Size(double length, double height) {
            this.length = length;
            this.height = height;
            setPerimeter();
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void setPerimeter(){
            this.perimeter = (this.height + this.length) * 2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Size size = (Size) o;
            return Double.compare(size.length, length) == 0
                    && Double.compare(size.height, height) == 0
                    && Double.compare(size.perimeter, perimeter) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(length, height, perimeter);
        }

        @Override
        public String toString() {
            return "Size{" +
                    ", length=" + length +
                    ", height=" + height +
                    ", perimeter=" + perimeter +
                    '}';
        }
    }

    /**
     * default constructor
     */
    public Plant() {
    }

    /**
     * Parameter constructors
     * @param name
     * @param color
     */
    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Plant(String name, String color, int stemCount, int lifeTime, double price) {
        this.name = name;
        this.color = color;
        this.stemCount = stemCount;
        this.lifeTime = lifeTime;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return stemCount == plant.stemCount
                && lifeTime == plant.lifeTime
                && Double.compare(plant.price, price) == 0
                && Objects.equals(name, plant.name)
                && Objects.equals(color, plant.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, stemCount, lifeTime, price);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", stemCount=" + stemCount +
                ", lifeTime=" + lifeTime +
                ", price=" + price +
                ", size=" + size +
                '}' + '\n';
    }
}
