package br.com.jhonatansouza.designfactory.designfactory.product

class IosButton: Button {
    override fun render() {
        print("Rendering iOS Button")
    }

    override fun onClick() {
        print("CLicking iOS Button")
    }
}