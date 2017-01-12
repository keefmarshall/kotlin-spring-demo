package com.bcsg.keith.kotlinspringdemo

import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

/**
 * Created by keith on 12/01/2017.
 */
@RestController
class HelloWorldController
{
    val emptyBody = "<empty/>"

    data class SimpleTextResponse(val text: String)

    @GetMapping("/")
    fun helloWorld() = SimpleTextResponse("Hello, World!")

    @PostMapping("/post")
    fun showPost(@RequestBody data: String) = println(data)

    // catch all, prints request path
    @RequestMapping("/*")
    fun catchAll(request: HttpServletRequest, @RequestBody(required = false) data: String?): String
    {
        print("Unmapped ${request.method} request: ${request.requestURI}")

        if (request.queryString != null) println("?${request.queryString}")
        else println()

        val body = data ?: emptyBody
        println("Body: $body")
        return body
    }
}