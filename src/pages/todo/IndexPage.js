import { Outlet } from "react-router-dom";
import BaiscLayout from "../../layouts/BasicLayout";

const IndexPage = () => {
    return (
        <BaiscLayout>
            <div className="w-full flex m-2 p-2">
                <div className="text-xl m-1 p-2 w-20 font-extrabold text-center underline">
                    LIST
                </div>
                <div className="text-xl m-1 p-2 w-20 font-extrabold text-center underline">
                    ADD
                </div>
                <div className="flex flex-wrap w-full">
                    <Outlet/>
                </div>
            </div>
        </BaiscLayout>
    )
}

export default IndexPage;