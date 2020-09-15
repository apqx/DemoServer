package me.apqx

import me.apqx.bean.Student
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ServerController {

    /**
     * https://api.me.apqx.me/school?id=10
     * 或者
     * https://api.me.apqx.me/school?privateId=10
     */
    @GetMapping(value = ["/school"])
    fun getStudent(@RequestParam(value = "id", defaultValue = "privateId") id: Long): Student {
        // 以Json的形式返回
        // TODO 如何返回一个自定义的字符串
        return Student(id, "Tom$id")
    }
}