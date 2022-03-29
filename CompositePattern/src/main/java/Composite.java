/*
(alias Conteneur) est un élément domposé de sous-éléments (feuilles ou autres conteneurs).
Un conteneur ne connaît pas les classes de ses enfants.
Il passe par l'interface composant pour intéragir avec ses sous-éléments

Il délègue tout le travail aux composants enfants par les méthodes :
    . add(c: Component)
    . remove(c: Component)
    . getChildren(): Component[]
    . execute()
 */

public class Composite implements Component {
    @Override
    public void execute() {

    }
}
