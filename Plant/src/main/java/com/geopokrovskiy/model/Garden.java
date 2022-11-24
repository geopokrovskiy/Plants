package com.geopokrovskiy.model;

import java.util.Arrays;

public class Garden {
    private Plant[] arrayOfPlants;
    private int index;

    /**
     * parameter constructor
     * @param n
     */
    public Garden(int n) {
        this.arrayOfPlants = new Plant[n];
    }

    /**
     * add - аргумент объект типа Plant, который добавляет цветок в массив растений,
     * возвращает true или false - получилось ли добавить цветок в массив или нет.
     * @param newPlant
     * @return
     */
    public boolean add(Plant newPlant){
        if(newPlant.equals(null) || (index == this.arrayOfPlants.length - 1)){
            return false;
        }
        else {
            this.arrayOfPlants[index] = newPlant;
            index++;
            return true;
        }
    }

    /**
     * get на вход принимает индекс растения, возвращает растение из массива
     * растений по его индексу или null если индекс некорректный.
     * @param index
     * @return
     */
    public Plant get(int index){
        if(index <= this.index && index >= 0){
            Plant plantToGet = this.arrayOfPlants[index];
            return plantToGet;
        }
        else return null;
    }

    /**
     * count - возвращает реальное количество растений в саду
     * (столько сколько добавлено в массив, а не его размер).
     * @return
     */
    public int count(){
        return index;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "arrayOfPlants=" + Arrays.toString(arrayOfPlants) +
                ", numberOfPlants=" + index +
                '}';
    }

    /**
     * search на вход принимает объект растения и возвращает его индекс
     * в списке всех растений в саду или -1, если такой объект не найден
     * @param plantToFind
     * @return
     */
    public int search(Plant plantToFind){
        for (int i = 0; i < this.index; i++) {
            if(arrayOfPlants[i].equals(plantToFind)){
                return i;
            }
        }
        return -1;
    }

    /**
     * search на вход принимает название растения и возвращает его индекс
     * в списке всех растений в саду или -1, если такой объект не найден
     * @param name
     * @return
     */
    public int search(String name){
        for(int i = 0; i < this.index; i++){
            if(arrayOfPlants[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    /**
     * delete принимает на вход имя растения и производит удаление растения по его имени из сада,
     * сдвигая все растения после удаленного влево, возвращает удаленный объект растения
     * @param name
     * @return
     */
    public Plant delete(String name){
        int indexOfOccurrence = this.search(name);
        if(indexOfOccurrence == -1){
            return null;
        } else {
            Plant plantToGet = this.arrayOfPlants[indexOfOccurrence];
            for (int i = indexOfOccurrence; i < this.index - 1; i++) {
                this.arrayOfPlants[i] = this.arrayOfPlants[i + 1];
            }
            this.index--;
            return plantToGet;
        }
    }

    /**
     * delete принимает на вход объект растения и производит удаление данного растения из сада,
     * сдвигая все растения после удаленного влево, возвращает логическое значение, получилось или нет удалить растение.
     */
    public boolean delete(Plant plantToDelete) {
        int indexOfOccurrence = this.search(plantToDelete);
        if (indexOfOccurrence == -1) {
            return false;
        } else {
            for (int i = indexOfOccurrence; i < this.index - 1; i++) {
                this.arrayOfPlants[i] = this.arrayOfPlants[i + 1];
            }
            this.index--;
            return true;
        }
    }

    /**
     * insert принимает на вход индекс и объект типа Plant и производит вставку этого объекта по заданному индексу,
     * сдвигая все имеющиеся объекты вправо, возвращает логическое значение, получилось или нет вставить растение
     */
    public boolean insert(int index, Plant plant){
        if(plant.equals(null) || (this.index == this.arrayOfPlants.length) || (index > this.index)){
            return false;
        }
        else{
            for (int i = this.index; i > index; i--) {
                this.arrayOfPlants[i] = this.arrayOfPlants[i - 1] ;
            }
            this.arrayOfPlants[index] = plant;
            this.index++;
            return true;
        }
    }
}
