package br.com.jhonatansouza.designfactory.designfactory

import br.com.jhonatansouza.designfactory.designfactory.factory.AndroidFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//@SpringBootApplication
class DesignFactoryApplication

/**
 * Car Location System, that should provide diferent types of location
 */
fun main(args: Array<String>) {
	//runApplication<DesignFactoryApplication>(*args)

	AndroidFactory().createButton().render()
}
