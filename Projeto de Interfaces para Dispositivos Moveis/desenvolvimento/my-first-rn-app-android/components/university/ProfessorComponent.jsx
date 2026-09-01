import {View, Text, StyleSheet, Image} from "react-native"

const ProfessorComponent = ({name, title, imagesrc}) => {
    
    return (
        <View style={styles.card}>
           <Image source={{uri:imagesrc}} style={styles.image}/>
           
           <View style={styles.info}>
                <Text style={styles.name}>{name}</Text>
                <Text style={styles.title}>{title}</Text>
           </View>
        </View>
    )
} //ProfessorComponent

const styles = StyleSheet.create(
    {
        card:{
            flexDirection: "row",
            alignItems: "center",
            padding: 16,
            margin: 16,
            backgroundColor: "#FFF",
            borderRadius: 14,
            
            shadowColor: "#000",
            shadowOffset: {width: 0, height: 2},
            shadowOpacity: 0.08,
            shadowRadius: 6,
            elevation: 5,
            
        },
        image: {
            width: 80,
            height: 80,
            borderRadius: 40,
            marginRight: 16,
            backgroundColor: "#E5E5EA"
        },
        info: {
            
        },
        name: {
            fontSize: 20,
            fontWeight: "bold",
            color: "1C1C1E"
        },
        title: {
            fontSize: 16,
            color: "#6E6E73",
            marginBottom: 8
        }
        
    }
)

export default ProfessorComponent