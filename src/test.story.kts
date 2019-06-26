/*
 * This is a template story.kts file. For more information on how to customize it, check the documentation.
 *
 * If autocompletion does not load, or some elements are marked as missing for no reason,
 * close and re-open IntelliJ IDEA.
 */

// Replace "CommonEngine" by another engine if you wish to change the targeted engine
val eng = requireEngine<CommonEngine>()

// Remove the following line if your project does not use resources and does not need to load them,
// or if you are targeting an engine which does not support resources
loadResources()

story {
    title = "Sample story"
    author = "Me"

    node(1) with {
        body {
            """
            This is my first node 
            """
        }
        option { "Go to my second node" } does { nodeRef(2) }

        onNodeReached {
            eng.imageBackground = resources["cat.jpg"]
        }
    }

    node(2) body {
        """
        This is my second node, and is also the final one!
        """
    }

}
