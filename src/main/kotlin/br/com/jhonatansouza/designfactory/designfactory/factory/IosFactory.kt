package br.com.jhonatansouza.designfactory.designfactory.factory

import br.com.jhonatansouza.designfactory.designfactory.product.Button
import br.com.jhonatansouza.designfactory.designfactory.product.IosButton

class IosFactory : ViewFactory() {
    override fun createButton(): Button {
        return IosButton()
    }
}