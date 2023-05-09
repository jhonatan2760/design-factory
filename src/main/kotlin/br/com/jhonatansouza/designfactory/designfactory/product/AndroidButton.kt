package br.com.jhonatansouza.designfactory.designfactory.product

class AndroidButton : Button {
    override fun render() {
        print("Rendering Android screen.")
    }

    override fun onClick() {
        print("On click Android Screen.")
    }
}