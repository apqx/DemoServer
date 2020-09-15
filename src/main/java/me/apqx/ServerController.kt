package me.apqx

import me.apqx.bean.Student
import org.springframework.web.bind.annotation.*

@RestController
class ServerController {

    /**
     * GET
     * https://api.me.apqx.me/school?id=10
     * defaultValue是当id不存在或未指定时，id的默认值
     */
    @GetMapping(value = ["/school"])
    fun getStudentByIdGET(@RequestParam(value = "id", defaultValue = "10") id: Long): Student {
        // 以Json的形式返回
        // TODO 如何返回一个自定义的字符串
        return Student(id, "Tom$id")
    }

    /**
     * POST form-data表单
     */
    @PostMapping(value = ["/school"])
    fun getStudentByIdPOST1(@RequestParam(value = "id", defaultValue = "10") id: Long): Student {
        // 以Json的形式返回
        // TODO 如何返回一个自定义的字符串
        return Student(id, "Tom$id")
    }

    @PostMapping(value = ["/school"])
    fun getStudentByIdPOST2(@RequestBody body: String): Student {
        // 以Json的形式返回
        println(body)
        // TODO 如何返回一个自定义的字符串
        return Student(1, "Tom")
    }
}