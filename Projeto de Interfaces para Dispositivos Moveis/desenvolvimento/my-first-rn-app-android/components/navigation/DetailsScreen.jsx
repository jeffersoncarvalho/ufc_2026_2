import {View, Text, StyleSheet} from "react-native"
import {Link} from "@react-navigation/native"

const DetailsScreen = () => {
    return (
        <View style={styles.container}> 
            <Text style={styles.title}>Tela de Detalhes!</Text>
            <Link screen="HomeScreen">Ir para Tela Principal!</Link>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        justifyContent: "center",
        alignItems:"center",
        flex: 1
    }
    ,
    title: {
        fontSize: 30,
        fontWeight: "bold",
        color: "orange"
    }
})

export default DetailsScreen