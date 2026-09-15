import { createNativeStackNavigator } from "@react-navigation/native-stack"

import HomeScreen from "./HomeScreen"
import DetailsScreen from "./DetailsScreen"

const Stack = createNativeStackNavigator()

const RootStack = () => {
    return (
        <Stack.Navigator initialRouteName="HomeScreen">
            <Stack.Screen name="HomeScreen" component={HomeScreen} />
            <Stack.Screen name="DetailsScreen" component={DetailsScreen} />
        </Stack.Navigator>
    )
}

export default RootStack