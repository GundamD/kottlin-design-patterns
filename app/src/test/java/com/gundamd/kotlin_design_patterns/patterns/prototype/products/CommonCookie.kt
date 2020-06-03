package com.gundamd.kotlin_design_patterns.patterns.prototype.products

class CommonCookie : Cookie() {
    override fun clone():Cookie {
       val cloneObject = CommonCookie()
        cloneObject.name = this.name
        cloneObject.ability = this.ability
        return cloneObject
    }

}