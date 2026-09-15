import { View, Text, StyleSheet } from "react-native"
import { Link } from "@react-navigation/native"

const HomeScreen = () => {
    return (
        <View style={styles.container}> 
            <Text style={styles.title}>Tela Principal!</Text>
            <Link screen="DetailsScreen">Ir para Detalhes!</Link>
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
        color: "blue"
    }
})

export default HomeScreen