package org.knit.solutions;
import org.knit.solutions.Task18.DupZer;
import org.knit.TaskDescription;


//Задача № 18
//Условие задачи:
//Дан массив целых чисел arr фиксированной длины. Необходимо продублировать каждое вхождение нуля, сдвигая остальные элементы вправо.
//
//Примечание:
//
//Элементы, выходящие за пределы исходного массива, не записываются.
//Изменения нужно выполнить на месте (in-place), не возвращая новый массив.
@TaskDescription(taskNumber = 18, taskDescription = "Задача № 18")
public class Task18Solution implements Solution{
    public void execute() {
        DupZer dz = new DupZer();
        int[] arr = new int[]{1,0,2,3,0,4,5,0};
        dz.duplicateZeros(arr);

        for (int a: arr){
            System.out.print(a);
        }
        System.out.println();
        int[] arr0 = new int[]{1,2,3};
        dz.duplicateZeros(arr0);

        for (int a: arr0){
            System.out.print(a);
        }
    }
}
