package me.apqx

import me.apqx.bean.Student
import org.springframework.web.bind.annotation.*

@RestController
class ServerController {

    /**
     * 获取学生列表，支持分页
     * @param lastId 已经获得的最后一个学生的[Student.id]，将返回该id之后的列表，未指定则从头开始返回
     * @param size 每页数据的数量，默认20
     */
    @PostMapping(value = ["/getStudentList"])
    fun getStudentList(@RequestParam(value = "id", defaultValue = "-1") lastId: Long,
        @RequestParam(value = "size", defaultValue = "20")size: Int): List<Student> {
        // 以Json的形式返回
        val list = ArrayList<Student>(size)
        val startId = lastId + 1
        for (i in startId until startId + size) {
            list.add(Student(i, "Tom$i"))
        }
        return list
    }

}