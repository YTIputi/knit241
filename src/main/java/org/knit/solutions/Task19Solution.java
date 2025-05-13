package org.knit.solutions;
import org.knit.solutions.task19.Solution19;
import org.knit.TaskDescription;

//Условие задачи:
//Даны два целочисленных массива nums1 и nums2, отсортированных в неубывающем порядке, а также два целых числа m и n, представляющих количество элементов в nums1 и nums2 соответственно.
//
//Требуется:
//Объединить nums1 и nums2 в один массив, отсортированный в неубывающем порядке.
//
//Важные условия:
//
//Итоговый отсортированный массив должен быть сохранён внутри массива nums1 (функция не должна ничего возвращать).
//Массив nums1 имеет длину m + n, где:
//Первые m элементов — значимые (их нужно объединять с nums2).
//Последние n элементов заполнены нулями и должны быть проигнорированы.
//Длина nums2 равна n

@TaskDescription(taskNumber = 19, taskDescription = "Задача № 19")
public class Task19Solution implements Solution{
    public void execute(){
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        Solution19 solution = new Solution19();
        solution.merge(nums1, 3, nums2, 3);

        for(int a: nums1){
            System.out.print(a);
        }

    }
}
