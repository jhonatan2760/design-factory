package br.com.jhonatansouza.designfactory.designfactory.factory

import br.com.jhonatansouza.designfactory.designfactory.product.Button

abstract class ViewFactory {


    abstract fun createButton(): Button

    fun render(){
        val button = createButton()
        button.render()
    }


}