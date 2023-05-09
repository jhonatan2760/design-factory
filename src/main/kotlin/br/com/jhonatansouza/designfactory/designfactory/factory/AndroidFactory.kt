package br.com.jhonatansouza.designfactory.designfactory.factory

import br.com.jhonatansouza.designfactory.designfactory.product.AndroidButton
import br.com.jhonatansouza.designfactory.designfactory.product.Button

class AndroidFactory : ViewFactory(){
    override fun createButton(): Button {
        return AndroidButton()
    }
}